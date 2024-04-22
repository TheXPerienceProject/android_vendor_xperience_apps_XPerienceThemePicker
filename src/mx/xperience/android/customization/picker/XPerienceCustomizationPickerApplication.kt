package mx.xperience.android.customization.picker

import android.app.Application;
import com.android.wallpaper.module.InjectorProvider;
import mx.xperience.android.customization.module.XPerienceThemePickerInjector;
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp(Application::class)
class XPerienceCustomizationPickerApplication : Hilt_XPerienceCustomizationPickerApplication() {

  @Inject
  lateinit var injector: XPerienceThemePickerInjector

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(injector);
    }

}
