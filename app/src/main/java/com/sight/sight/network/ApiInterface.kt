interface ApiInterface {
    @GET("posts")
    fun fetchAllPosts(): Call<List<PostModel>>
}