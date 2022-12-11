package com.danda.danda.model.repository.profile

import android.net.Uri
import com.danda.danda.model.dataclass.User
import com.danda.danda.util.Result
import com.google.firebase.auth.FirebaseUser

interface ProfileRepository {
    suspend fun getProfile(result :  (Result<FirebaseUser?>) -> Unit)
    suspend fun editProfile(username:String,name : String,id:String,email:String,file : Uri ,result : (Result<String?>)-> Unit)
    suspend fun getProfileUser(email:String?,result : (Result<User?>) -> Unit)
    suspend fun updateProfileUser (username: String,name:String,email:String,
                                   imgUrl:String, result : (Result<String>) -> Unit)

}