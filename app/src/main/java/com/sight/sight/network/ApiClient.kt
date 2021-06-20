const val = BASEURL = "https://jsonplaceholder.typicode.com/"
class Apiclient {
    private var retrofit: Retrofit? = null
    fun getApiclient(): Retrofit {
        val gson = GsonBuilder()
                .setLenient()
                .create()
        val okHttpClient = OkHttpClient.Builder()
                .readTimeout(100, TimeUnit.SECONDS)
                .connectTimeout(100, TimeUnit.SECONDS)
                .build()

        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
        }
        return retrofit!!
    }

}
