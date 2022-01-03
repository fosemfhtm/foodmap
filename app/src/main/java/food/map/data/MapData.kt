package food.map.data


import com.google.gson.annotations.SerializedName

data class MapData(
    @SerializedName("addresses")
    val addresses: List<Address>,
    @SerializedName("errorMessage")
    val errorMessage: String,
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("status")
    val status: String
) {
    data class Address(
        @SerializedName("addressElements")
        val addressElements: List<AddressElement>,
        @SerializedName("distance")
        val distance: Double,
        @SerializedName("englishAddress")
        val englishAddress: String,
        @SerializedName("jibunAddress")
        val jibunAddress: String,
        @SerializedName("roadAddress")
        val roadAddress: String,
        @SerializedName("x")
        val x: String,
        @SerializedName("y")
        val y: String
    ) {
        data class AddressElement(
            @SerializedName("code")
            val code: String,
            @SerializedName("longName")
            val longName: String,
            @SerializedName("shortName")
            val shortName: String,
            @SerializedName("types")
            val types: List<String>
        )
    }

    data class Meta(
        @SerializedName("count")
        val count: Int,
        @SerializedName("page")
        val page: Int,
        @SerializedName("totalCount")
        val totalCount: Int
    )
}