# Music App

Music App is an Android application that allows users to browse and play audio files from their device's external storage. It provides a user-friendly interface to explore and enjoy their music collection.

## Features

- Display a list of audio files available on the device
- Play, pause, and control playback of audio files
- Show the title and duration of the currently playing audio file
- Provide navigation options to the next and previous audio files
- Seek functionality to move to a specific position in the audio track

## Screenshots

Include some screenshots of your application to visually represent its features. For example:

![Main Screen](screenshots/main_screen.png)
![Music Player](screenshots/music_player.png)

## Prerequisites

- Android device or emulator running Android API level 21 or higher

## Getting Started

To get started with the Music App project, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/eljabriyassine/music_app.git


2. Open the project in Android Studio.

3. Build and run the project on your Android device or emulator.

## Permissions
The Music App requires the following permission:

android.permission.READ_EXTERNAL_STORAGE: This permission is required to access audio files stored on the device's external storage.
The application checks for the permission at runtime and requests it if not granted.

## Libraries Used
RecyclerView: For displaying the list of audio files.
MediaPlayer: For playing audio files.
SeekBar: For displaying the playback progress and seeking.
Contributions
Contributions to the Music App project are welcome! If you encounter any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.