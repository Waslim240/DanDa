package com.danda.danda.model.repository.detail

import android.net.Uri
import com.danda.danda.model.dataclass.Comment
import com.danda.danda.model.dataclass.Favorite
import com.danda.danda.model.dataclass.Recipe
import com.danda.danda.util.Result

interface DetailRepository {
    suspend fun commentList(nameRecipe: String, result: (Result<List<Comment>>) -> Unit)
    suspend fun commentListDetail(nameRecipe: String, result: (Result<List<Comment>>) -> Unit)
    suspend fun addComment(comment: Comment, result: (Result<String>) -> Unit)
//    suspend fun addFavorite(favorite: Favorite, file: Uri, result: (Result<String>) -> Unit)
}