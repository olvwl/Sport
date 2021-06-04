package com.example.core.domain.repository

import com.example.core.domain.model.Sport
import com.example.core.source.local.Resource

interface ISportRepository {

    fun getAllSport(): kotlinx.coroutines.flow.Flow<Resource<List<Sport>>>

    fun getFavoriteSport(): kotlinx.coroutines.flow.Flow<List<Sport>>

    fun setFavoriteSport(sport: Sport, state: Boolean)

}