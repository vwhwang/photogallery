package api

import retrofit2.http.GET

private const val API_KEY = "9de904d88d7ddf3c794428c36db4fc8c"

interface FlickrApi {
    @GET(
        "/services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): String
}