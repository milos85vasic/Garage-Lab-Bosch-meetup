package net.milosvasic.conferences.bosch.meetup1

/**
 * Let's present some functions.
 */
data class UserApiResponse(
        val userId: Int,
        val address: String,
        val metaData: Int = 0
)

// class ExtendedResponse : UserApiResponse()           <-- Compiler complains. Data class can't be inherited!

fun main(args: Array<String>) {
    val response = UserApiResponse(1, "Unknown")
    println(response)                                   // Prints the object in human readable form.
                                                        // output:
                                                        // UserApiResponse(userId=1, address=Unknown, metaData=0)
}