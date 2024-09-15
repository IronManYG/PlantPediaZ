package dev.gaddal.core.presentation.designsystem.colors

/**
 * Represents the color scheme modes available for the app's user interface.
 *
 * This enum class is used to manage the color scheme mode in the app's preferences or settings.
 * Users can select their preferred color scheme mode from the available options.
 *
 * @property Auto The color scheme will automatically switch between light and dark modes based on the system settings or other factors such as time of day.
 * @property Light The color scheme will be set to light mode, regardless of the system settings or other factors.
 * @property Dark The color scheme will be set to dark mode, regardless of the system settings or other factors.
 */
enum class ColorSchemeMode {
    /**
     * Represents the automatic color scheme mode.
     *
     * In this mode, the color scheme will automatically switch between light and dark modes based on the system settings or other factors such as time of day.
     */
    Auto,

    /**
     * Represents the light color scheme mode.
     *
     * In this mode, the color scheme will be set to light mode, regardless of the system settings or other factors.
     */
    Light,

    /**
     * Represents the dark color scheme mode.
     *
     * In this mode, the color scheme will be set to dark mode, regardless of the system settings or other factors.
     */
    Dark,
}
