package dev.gaddal.core.presentation.designsystem.colors

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import dev.gaddal.core.presentation.designsystem.colors.Pink40
import dev.gaddal.core.presentation.designsystem.colors.Pink80
import dev.gaddal.core.presentation.designsystem.colors.Purple40
import dev.gaddal.core.presentation.designsystem.colors.Purple80
import dev.gaddal.core.presentation.designsystem.colors.PurpleGrey40
import dev.gaddal.core.presentation.designsystem.colors.PurpleGrey80

/**
 * ColorScheme: default
 */
val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
)

val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)