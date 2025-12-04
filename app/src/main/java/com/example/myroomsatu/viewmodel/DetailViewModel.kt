package com.example.myroomsatu.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myroomsatu.repositori.RepositoriSiswa
import com.example.myroomsatu.view.route.DestinasiDetailSiswa
import com.example.myroomsatu.room.Siswa
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

fun Siswa.toDetailSiswa(): EntryViewModel.DetailSiswa = EntryViewModel.DetailSiswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)
