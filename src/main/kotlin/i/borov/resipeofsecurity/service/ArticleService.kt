package i.borov.resipeofsecurity.service

import i.borov.resipeofsecurity.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(
    private val articleRepo: ArticleRepository
) {

    fun findAll() =
        articleRepo.findAll()
}