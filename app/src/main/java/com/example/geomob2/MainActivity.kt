package com.example.geomob2

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.DividerItemDecoration



class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var mToolbar : Toolbar
        lateinit var mTitle : TextView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mToolbar=findViewById(R.id.toolbar)
        mToolbar.setTitle(getString(R.string.app_name))
        mTitle = mToolbar.findViewById(R.id.toolbar_title)
        setSupportActionBar(mToolbar)
        mTitle.setText(mToolbar.getTitle())

        getSupportActionBar()?.setDisplayShowTitleEnabled(false)
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView!!.setLayoutManager(LinearLayoutManager(this))

       saveTaskPerso("Australia","Kylie Minogue")
        saveTaskPerso("Australia","Hugh Jackman")
        saveTaskPerso("Australia","Cate Blanchett")
        saveTaskPerso("Brazil","Ayrton Senna")
        saveTaskPerso("Brazil","Loalwa Braz")
        saveTaskPerso("Brazil","Antônio Carlos Jobim")
        saveTaskPerso("Germany","Albert Einstein")
        saveTaskPerso("Germany","Martin Luther")
        saveTaskPerso("Germany","Claudia Schiffer")
        saveTaskPerso("India","Jyoti Amge")
        saveTaskPerso("India","Priyanka Chopra")
        saveTaskPerso("India","Nandita Das")
        saveTaskPerso("Italy","Kylie Minogue")
        saveTaskPerso("Italy","Hugh Jackman")
        saveTaskPerso("Italy","Cate Blanchett")

        saveTaskRes("Australia","la bauxite")
        saveTaskRes("Australia","le charbon bitumineux")
        saveTaskRes("Australia","le minerai de fer")
        saveTaskRes("Brazil","la bauxite")
        saveTaskRes("Brazil","l\'or")
        saveTaskRes("Brazil","le fer")
        saveTaskRes("Germany","uranium")
        saveTaskRes("Germany","charbon")
        saveTaskRes("Germany","gaz naturel")
        saveTaskRes("India","la bauxite")
        saveTaskRes("India","le charbon bitumineux")
        saveTaskRes("India","le minerai de fer")
        saveTaskRes("Italy","la bauxite")
        saveTaskRes("Italy","le minerai de fer")
        saveTaskRes("Italy","uranium")

        saveTaskDiapo("Australia",R.drawable.alger)
        saveTaskDiapo("Australia",R.drawable.alger)
        saveTaskDiapo("Australia",R.drawable.alger)
        saveTaskDiapo("Brazil",R.drawable.diapo_bra)
        saveTaskDiapo("Brazil",R.drawable.diapo_b)
        saveTaskDiapo("Brazil",R.drawable.diapo_brazil)
        saveTaskDiapo("Germany",R.drawable.diapo_g)
        saveTaskDiapo("Germany",R.drawable.diapo_ger)
        saveTaskDiapo("Germany",R.drawable.diapo_germ)
        saveTaskDiapo("India",R.drawable.diapo_in)
        saveTaskDiapo("India",R.drawable.diapo_ind)
        saveTaskDiapo("India",R.drawable.diapo_india)
        saveTaskDiapo("Italy",R.drawable.diapo_it)
        saveTaskDiapo("Italy",R.drawable.diapo_ital)
        saveTaskDiapo("Italy",R.drawable.diapo_italy)

        saveTaskHist("Australia","Indépendance","1/01/1901")
        saveTaskHist("Brazil"," Indépendance Royaume-Uni de Portugal,du Brésil ","29/08/1825")
        saveTaskHist("Germany"," Confédération du Rhin","1806/1813")
        saveTaskHist("Germany"," Confédération germanique","1815/1848")
        saveTaskHist("Germany"," Reich allemand","1871-1918")
        saveTaskHist("Germany"," Chute du Mur","9/11/1989")
        saveTaskHist("Germany"," Réunification","3/10/1990")
        saveTaskHist("India","Drapeau de l\'Empire britanniques des Indes Raj britannique"," 1947")
        saveTaskHist("Italy"," Unification","17/03/1861")
        saveTaskHist("Italy","République","2/06/1946")



        saveTaskVid("Australia"," <iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aeEy4t8fDsw\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Australia","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ynHIlx5RgtI\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Australia","<iframe width=\"731\" height=\"411\" src=\"https://www.youtube.com/embed/qmgSHP4Fhgg\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Brazil","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JPREedtkQHk\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Brazil","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JPREedtkQHk\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Germany"," <iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/J0osm0i9FPM\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Germany","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/wuClZjOdT30\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Germany","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/J0osm0i9FPM\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("India","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IgAnj6r1O48\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("India","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vEy6tcU6eLU\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("India","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IgAnj6r1O48\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Italy","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FlRwssZYRM0\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Italy","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Y16QLJOVP6s\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
        saveTaskVid("Italy","<iframe width=\"731\" height=\"411\" src=\"https://www.youtube.com/embed/K6G_clfRX5U\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")



        saveTask("Australia",R.drawable.flag_australia,resources.getStringArray(R.array.population_array)[0],
            resources.getStringArray(R.array.description_array)[0],
            resources.getStringArray(R.array.surface_array)[0],
            R.raw.austr)

        saveTask("Brazil",R.drawable.flag_brazil,resources.getStringArray(R.array.population_array)[1],
            resources.getStringArray(R.array.description_array)[1],
            resources.getStringArray(R.array.surface_array)[1],
            R.raw.bresil)

        saveTask("Germany",R.drawable.flag_germany,resources.getStringArray(R.array.population_array)[2],
            resources.getStringArray(R.array.description_array)[2],
            resources.getStringArray(R.array.surface_array)[2],
            R.raw.germany)

        saveTask("India",R.drawable.flag_india,resources.getStringArray(R.array.population_array)[3],
            resources.getStringArray(R.array.description_array)[3],
            resources.getStringArray(R.array.surface_array)[3],
            R.raw.germany)

        saveTask("Italy",R.drawable.flag_italy,resources.getStringArray(R.array.population_array)[4],
            resources.getStringArray(R.array.description_array)[4],
            resources.getStringArray(R.array.surface_array)[4],
            R.raw.italy)


        getCountry()



    }

    private fun getCountry() {
        class GetCountry: AsyncTask<Void, Void, List<Country>>() {

            override fun doInBackground(vararg voids: Void): List<Country> {
                return DatabaseClient
                    .getInstance(applicationContext)
                    .appDatabase
                    .CountryDao()
                    .getAll()
            }

            override fun onPostExecute(Country: List<Country>) {
             super.onPostExecute(Country)
             val adapter = CountryAdapter(this@MainActivity, Country)
            recyclerView!!.adapter = adapter
        }
        }
        val gt = GetCountry()
        gt.execute()
    }

    private fun saveTask(title:String,image:Int,pop:String,description:String,surface:String,hymne:Int) {
        val titleVal = title
        val imageVal = image
        val population=pop
        val description=description
        val surface=surface
        val hymne=hymne




    class SaveCountry: AsyncTask<Void, Void, Void>() {

        override fun doInBackground(vararg voids: Void): Void? {

            //creating a task
            val country = Country(titleVal, imageVal,population,description,surface,hymne)

            //adding to database
            DatabaseClient.getInstance(applicationContext).appDatabase
                .CountryDao()
                .insert(country)
            return null
        }}


    val st = SaveCountry()
    st.execute()
}
    private fun saveTaskPerso(title:String,name:String) {
        val titleVal = title
        val persoVal = name


        class SavePerson: AsyncTask<Void, Void, Void>() {

            override fun doInBackground(vararg voids: Void): Void? {

                //creating a task
                val perso = Personnalites(titleVal,persoVal)

                //adding to database
                DatabaseClient.getInstance(applicationContext).appDatabase
                    .PersonnalitesDao()
                    .insert(perso)
                return null
            }}


        val st = SavePerson()
        st.execute()
    }
    private fun saveTaskRes(title:String,name:String) {
        val titleVal = title
        val resVal = name

        class SaveRes: AsyncTask<Void, Void, Void>() {

            override fun doInBackground(vararg voids: Void): Void? {

                //creating a task
                val res= Ressources(titleVal,resVal)

                //adding to database
                DatabaseClient.getInstance(applicationContext).appDatabase
                    .RessourcesDao()
                    .insert(res)
                return null
            }}


        val st = SaveRes()
        st.execute()
    }

    private fun saveTaskVid(title:String,video:String) {
        val titleVal = title
        val vidVal = video

        class SaveVid: AsyncTask<Void, Void, Void>() {

            override fun doInBackground(vararg voids: Void): Void? {

                //creating a task
                val vid= Videos(titleVal,vidVal)

                //adding to database
                DatabaseClient.getInstance(applicationContext).appDatabase
                    .VideoDao()
                    .insert(vid)
                return null
            }}

        val st = SaveVid()
        st.execute()
    }

    private fun saveTaskDiapo(title:String,image:Int) {
        val titleVal = title
        val imageVal = image

        class SaveImage: AsyncTask<Void, Void, Void>() {

            override fun doInBackground(vararg voids: Void): Void? {

                //creating a task
                val image= Diapo(titleVal,imageVal)

                //adding to database
                DatabaseClient.getInstance(applicationContext).appDatabase
                    .DiapoDao()
                    .insert(image)
                return null
            }}

        val st = SaveImage()
        st.execute()
    }

    private fun saveTaskHist(title:String,hist:String,date:String) {
        val titleVal = title
        val histVal = hist
        val date=date

        class SaveHist: AsyncTask<Void, Void, Void>() {

            override fun doInBackground(vararg voids: Void): Void? {

                //creating a task
                val hist= Historique(titleVal,histVal,date)

                //adding to database
                DatabaseClient.getInstance(applicationContext).appDatabase
                    .HistoriqueDao()
                    .insert(hist)
                return null
            }}

        val st = SaveHist()
        st.execute()
    }

}
