package i.borov.resipeofsecurity.dto

import java.util.*

data class ArticleResponse(
    val id: UUID,
    val title: String,
    val content: String,
)