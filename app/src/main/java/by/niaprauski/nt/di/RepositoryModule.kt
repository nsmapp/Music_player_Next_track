package by.niaprauski.nt.di

import by.niaprauski.data.repoimpl.TracRepoImpl
import by.niaprauski.domain.repository.TrackRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindTrackRepository(
        trackRepoImpl: TracRepoImpl
    ): TrackRepository
}