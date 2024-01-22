The Dog App - a free app for every dog lover!

..................................................

In this App you can find thousands of dog of different breeds and colors. 
They are represented as a list of images and names, and you can open more information about particular dogs with their descriptions by clicking an item.
You also have an opportunity to save concrete ones to your own list by clicking the "like" icon.

..................................................

App Structure:

 1. Main Fragment - a fragment with a list of dogs. Initially opened. Represented right after the Splash Screen. Uses RecyclerView. Contains 'liked' button. Each item is clickable and has its image, name and 'like' button. Clicking 'like' button means saving particular dog into the local database. Clicking a dog already been clicked means deleting that dog from the local database;
 2. Liked Dogs Fragment - a fragment with a list of dogs been liked, accessible from the main fragment by clicking 'liked' button. Contains 'back' button meaning navigation back to the Main Fragment. All liked dogs are saved into the local database;
 3. Details Fragment - a fragment with detailed information about particular dog. Works offline. Being opened after clicking a dog from the Main fragment or from the Liked Dogs Fragment. Contains a name, an image and a description of a chosen dog. Contains 'back' button meaning navigation back to the Main Fragment or Liked Dogs Fragment - depends on where this Details Fragment was opened from.

..................................................

Technologies being used:

  * Databases:
    SQLite;

  * Programming languages:
    Kotlin,
    XML;

  * Libraries:
    Kotlin Coroutines,
    LivaData,
    DataBinding,
    AndroidX,
    Navigation,
    JUnit,
    SplashScreen API,
    SwipeRefreshLayout,
    Butterknife/Dagger2?,(dependency injector)
    RxJava/RxJava2/RxAndroid/RxKotlin?,(reliant on ReactiveStreams, a standard for asynchronous stream processing with non-blocking backpressure)
    FlexboxLayout?,(similar capabilities to the CSS Flexible Box Layout Module)
    klaxon?.(to parse JSON into Kotlin)

..................................................

External libraries:
  ROOM,
  Retrofit,
  Lottie?,(supports solids, shape layers, masks, alpha mattes, trim paths, and dash patterns)
  Glide?,(to transform the image)
  ExpansionPanel?,(multiple expansion layouts)
  MyLittleCanvas?.(to facilitate work with canvas on Android)

..................................................

This app is using public API: 
  https://thedogapi.com
