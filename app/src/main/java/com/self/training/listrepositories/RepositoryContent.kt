package com.self.training.listrepositories

object RepositoryContent {
    val ITEMS: MutableList<RepositoryCard> = ArrayList()
    val ITEM_MAP: MutableMap<String, RepositoryCard> = HashMap()
    private const val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(putRepositoryInformation(i))
        }

    }

    data class RepositoryCard(val id: String, val description: String, val ownerUsername: String,
                              val title: String, val fullName: String) {
        override fun toString(): String = "Repository title: $title\n\nDescription: $description\n\nBy: $ownerUsername"
    }

    private fun addItem(item: RepositoryCard) {
        ITEMS.add(item)

        ITEM_MAP[item.id] = item
    }

    private fun putRepositoryInformation(position: Int): RepositoryCard {
        return RepositoryCard(position.toString(), "Item $position", "", "", "")
    }

}