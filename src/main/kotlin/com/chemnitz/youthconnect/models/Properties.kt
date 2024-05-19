import org.springframework.data.mongodb.core.mapping.Field
import java.time.Instant

data class Properties(
    @Field("OBJECTID")
    val objectId: Int,

    @Field("ID")
    val id: Int,

    @Field("TRAEGER")
    val traeger: String,

    @Field("STRASSE")
    val strasse: String,

    @Field("PLZ")
    val plz: String,

    @Field("ORT")
    val ort: String,

    @Field("LEISTUNGEN")
    val leistungen: String? = null,

    @Field("BEZEICHNUNG")
    val bezeichnung: String? = null,

    @Field("KURZBEZEICHNUNG")
    val kurzbezeichnung: String? = null,

    @Field("TELEFON")
    val telefon: String? = null,

    @Field("EMAIL")
    val email: String? = null,

    @Field("FAX")
    val fax: String? = null,

    @Field("TYP")
    val typ: Int? = null,

    @Field("ART")
    val art: String? = null,

    @Field("STANDORTTYP")
    val standortTyp: String? = null,

    @Field("BEZEICHNUNGZUSATZ")
    val bezeichnungZusatz: String? = null,

    @Field("PROFILE")
    val profile: String? = null,

    @Field("SPRACHEN")
    val sprachen: String? = null,

    @Field("WWW")
    val www: String? = null,

    @Field("TRAEGERTYP")
    val traegerTyp: Int? = null,

    @Field("BEZUGNR")
    val bezugNr: String? = null,

    @Field("GEBIETSARTNUMMER")
    val gebietsArtNummer: Int? = null,

    @Field("SNUMMER")
    val sNummer: Int? = null,

    @Field("NUMMER")
    val nummer: Int? = null,

    @Field("GlobalID")
    val globalId: String? = null,

    @Field("CreationDate")
    val creationDate: Instant? = null,

    @Field("Creator")
    val creator: String? = null,

    @Field("EditDate")
    val editDate: Instant? = null,

    @Field("Editor")
    val editor: String? = null,

    @Field("BARRIEREFREI")
    val barrierefrei: Int? = null,

    @Field("INTEGRATIV")
    val integrativ: Int? = null
)
