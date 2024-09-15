package dev.gaddal.core.presentation.designsystem

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import dev.gaddal.core.presentation.designsystem.colors.ColorSchemeMode
import dev.gaddal.core.presentation.designsystem.colors.ColorSchemeMode.Auto
import dev.gaddal.core.presentation.designsystem.colors.ColorSchemeMode.Dark
import dev.gaddal.core.presentation.designsystem.colors.ColorSchemeMode.Light
import dev.gaddal.core.presentation.designsystem.colors.ColourScheme
import dev.gaddal.core.presentation.designsystem.colors.ColourScheme.Default
import dev.gaddal.core.presentation.designsystem.colors.ColourScheme.Dynamic
import dev.gaddal.core.presentation.designsystem.colors.ColourScheme.NaturesCalm
import dev.gaddal.core.presentation.designsystem.colors.ColourScheme.SkyHigh
import dev.gaddal.core.presentation.designsystem.colors.DarkColorScheme
import dev.gaddal.core.presentation.designsystem.colors.LightColorScheme
import dev.gaddal.core.presentation.designsystem.colors.NaturesCalmDarkColors
import dev.gaddal.core.presentation.designsystem.colors.NaturesCalmLightColors
import dev.gaddal.core.presentation.designsystem.colors.SkyHighDarkColors
import dev.gaddal.core.presentation.designsystem.colors.SkyHighLightColors

@Composable
fun PlantPediaZTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    colourScheme: ColourScheme = Default,
    colorSchemeMode: ColorSchemeMode = Auto,
    typography: Typography = TajawalTypography(),
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val colorScheme = when (colourScheme) {
        Default -> {
            when (colorSchemeMode) {
                Auto -> if (darkTheme) DarkColorScheme else LightColorScheme
                Dark -> DarkColorScheme
                Light -> LightColorScheme
            }
        }
        // Dynamic color is available on Android 12+
        Dynamic -> {
            when (colorSchemeMode) {
                Auto -> {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) if (darkTheme) dynamicDarkColorScheme(
                        context
                    ) else dynamicLightColorScheme(context) else if (darkTheme) DarkColorScheme else LightColorScheme
                }

                Dark -> {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) dynamicDarkColorScheme(
                        context
                    ) else DarkColorScheme
                }

                Light -> {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) dynamicLightColorScheme(
                        context
                    ) else LightColorScheme
                }

                else -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) dynamicDarkColorScheme(
                    context
                ) else if (darkTheme) DarkColorScheme else LightColorScheme
            }
        }

        SkyHigh -> {
            when (colorSchemeMode) {
                Auto -> if (darkTheme) SkyHighDarkColors else SkyHighLightColors
                Dark -> SkyHighDarkColors
                Light -> SkyHighLightColors
                else -> if (darkTheme) SkyHighDarkColors else SkyHighLightColors
            }
        }

        NaturesCalm -> {
            when (colorSchemeMode) {
                Auto -> if (darkTheme) NaturesCalmDarkColors else NaturesCalmLightColors
                Dark -> NaturesCalmDarkColors
                Light -> NaturesCalmLightColors
                else -> if (darkTheme) NaturesCalmDarkColors else NaturesCalmLightColors
            }
        }

        else -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
            } else {
                if (darkTheme) SkyHighDarkColors else SkyHighLightColors
            }
        }
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
//            (view.context as Activity).window.statusBarColor = colorScheme.primary.toArgb() // Set status bar color to primary color,remove it if you want color status bar to be transparent
            val window = (view.context as Activity).window
            val insetsController = WindowCompat.getInsetsController(window, view)
            insetsController.isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        content = content
    )

}