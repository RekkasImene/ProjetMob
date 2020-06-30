package com.example.geomob2

import android.media.MediaPlayer
import android.os.AsyncTask
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import kotlinx.android.synthetic.main.activity_detail.*
import android.os.Handler
import android.widget.SeekBar

class DetailActivity : AppCompatActivity(){

    private lateinit var runnable:Runnable
    private var handler: Handler = Handler()

    lateinit var mToolbar : Toolbar
    lateinit var mTitle : TextView
    private var mp: MediaPlayer? = null
    private var recyclerView: RecyclerView? = null
    private var recyclerViewRes: RecyclerView? = null
    private var recyclerViewVid: RecyclerView? = null
    private var recyclerViewHist: RecyclerView? = null
    private var slideModels: ArrayList<SlideModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        mToolbar=findViewById(R.id.toolbar2)
        mTitle = mToolbar.findViewById(R.id.toolbar_title2)

        recyclerView = findViewById(R.id.listPersonnalites)
        recyclerView!!.setLayoutManager(LinearLayoutManager(this))
        recyclerViewRes = findViewById(R.id.listRessources)
        recyclerViewRes!!.setLayoutManager(LinearLayoutManager(this))
        recyclerViewVid = findViewById(R.id.videoListView)
        recyclerViewVid!!.setLayoutManager(LinearLayoutManager(this))
        recyclerViewHist = findViewById(R.id.listHistorique)
        recyclerViewHist!!.setLayoutManager(LinearLayoutManager(this))

        val i = intent.getSerializableExtra("Country") as Country

        loadCountry(i)



}
    private fun loadCountry(i:Country) {
        mToolbar.setTitle(i.title)
        setSupportActionBar(mToolbar)
        mTitle.setText(mToolbar.getTitle())
        getSupportActionBar()?.setDisplayShowTitleEnabled(false)

        flag.setImageResource(i.image)
        surface.setText(i.surface)
        description.setText(i.description)
        population.setText(i.population)
        getPersonnalitesByTitle(i.title)
        getRessourcesByTitle(i.title)
        getVideoByTitle(i.title)
        btn_play.setOnClickListener{
            lireAudio(i.hymne)
            initializeSeekBar()
        }
        getDiapoByTitle(i.title)
        getHistByTitle(i.title)

        // Seek bar change listener
        seek_bar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                if (b) {
                    mp!!.seekTo(i * 1000)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
}




    private fun getPersonnalitesByTitle(title:String) {
        class GetPersonnalitesByTitle : AsyncTask<Void, Void, List<Personnalites>>() {

            override fun doInBackground(vararg voids: Void): List<Personnalites> {
                return DatabaseClient
                    .getInstance(applicationContext)
                    .appDatabase
                    .PersonnalitesDao()
                    .getPersonnalites(title)
            }
            override fun onPostExecute(Person: List<Personnalites>) {
                super.onPostExecute(Person)
                val adapter = PersonnalitesAdapter(this@DetailActivity, Person)
                recyclerView!!.adapter = adapter
            }

        }

        val gt = GetPersonnalitesByTitle()
        gt.execute()
    }

    private fun getRessourcesByTitle(title:String) {
        class GetRessourcesByTitle : AsyncTask<Void, Void, List<Ressources>>() {

            override fun doInBackground(vararg voids: Void): List<Ressources> {
                return DatabaseClient
                    .getInstance(applicationContext)
                    .appDatabase
                    .RessourcesDao()
                    .getRessources(title)
            }
            override fun onPostExecute(Res: List<Ressources>) {
                super.onPostExecute(Res)
                val adapter = RessourcesAdapter(this@DetailActivity, Res)
                recyclerViewRes!!.adapter = adapter
            }

        }

        val gt = GetRessourcesByTitle()
        gt.execute()
    }

    private fun getVideoByTitle(title:String) {
        class GetVideoByTitle : AsyncTask<Void, Void, List<Videos>>() {

            override fun doInBackground(vararg voids: Void): List<Videos> {
                return DatabaseClient
                    .getInstance(applicationContext)
                    .appDatabase
                    .VideoDao()
                    .getVideos(title)
            }
            override fun onPostExecute(Vid: List<Videos>) {
                super.onPostExecute(Vid)
                val adapter = VideoAdapter(this@DetailActivity, Vid)
                recyclerViewVid!!.adapter = adapter
            }

        }

        val gt = GetVideoByTitle()
        gt.execute()
    }
    private fun getDiapoByTitle(title:String) {
        class GetDiapoByTitle : AsyncTask<Void, Void, List<Diapo>>() {

            override fun doInBackground(vararg voids: Void): List<Diapo> {
                return DatabaseClient
                    .getInstance(applicationContext)
                    .appDatabase
                    .DiapoDao()
                    .getImages(title)
            }
            override fun onPostExecute(Img: List<Diapo>) {
                super.onPostExecute(Img)
                val imageSlider:ImageSlider = findViewById(R.id.slider)
                for(element in Img)
                    slideModels.add(SlideModel(element.image))
                imageSlider.setImageList(slideModels,centerCrop = true)

            }

        }

        val gt = GetDiapoByTitle()
        gt.execute()
    }

    private fun getHistByTitle(title:String) {
        class GetHistByTitle : AsyncTask<Void, Void, List<Historique>>() {

            override fun doInBackground(vararg voids: Void): List<Historique> {
                return DatabaseClient
                    .getInstance(applicationContext)
                    .appDatabase
                    .HistoriqueDao()
                    .getHistorique(title)
            }
            override fun onPostExecute(his: List<Historique>) {
                super.onPostExecute(his)
                val adapter = HistoriqueAdapter(this@DetailActivity, his)
                recyclerViewHist!!.adapter = adapter

            }
        }
        val gt = GetHistByTitle()
        gt.execute()
    }

    fun lireAudio(resId: Int) {
        if (mp == null) {        //set up MediaPlayer
            mp = MediaPlayer.create(this, resId)

            try {
                mp!!.prepare()

            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
        if (!mp!!.isPlaying()){
            mp!!.start()
            btn_play.setImageResource(R.drawable.ic_pause)
        }
        else{
            mp!!.pause()
            btn_play.setImageResource(R.drawable.ic_play)}
    }

    // Method to initialize seek bar and audio stats
    private fun initializeSeekBar() {
        seek_bar.max = mp!!.seconds

        runnable = Runnable {
            seek_bar.progress = mp!!.currentSeconds

            elapsedTimeLabel.text = "${mp!!.currentSeconds} sec"
            val diff = mp!!.seconds - mp!!.currentSeconds
            remainingTimeLabel.text = "$diff sec"

            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }
    // Extension property to get media player duration in seconds
    val MediaPlayer.seconds:Int
        get() {
            return this.duration / 1000
        }
    // Extension property to get media player current position in seconds
    val MediaPlayer.currentSeconds:Int
        get() {
            return this.currentPosition/1000
        }

}






