package dev.gaddal.core.presentation.designsystem.colors

/**
 * Represents the color schemes available for the app's user interface.
 *
 * This enum class is used to manage the color scheme in the app's preferences or settings.
 * Users can select their preferred color scheme from the available options.
 *
 * @property Default The default color scheme of the app.
 * @property Dynamic The dynamic color scheme based on Android's Material You design.
 * @property SkyHigh A color scheme inspired by the colors of the sky.
 * @property NaturesCalm A color scheme inspired by the calm and soothing colors of nature.
 */
enum class ColourScheme {
    /**
     * Represents the default color scheme of the app.
     *
     * This color scheme uses the standard colors defined in the app's design guidelines.
     */
    Default,

    /**
     * Represents the dynamic color scheme based on Android's Material You design.
     *
     * This color scheme automatically generates and applies colors based on the user's wallpaper and system settings.
     * It creates a personalized and adaptive color theme for the app's user interface.
     */
    Dynamic,

    /**
     * Represents a color scheme inspired by the colors of the sky.
     *
     * This color scheme uses various shades of blue and white to create a serene and peaceful look for the app's user interface.
     */
    SkyHigh,

    /**
     * Represents a color scheme inspired by the calm and soothing colors of nature.
     *
     * This color scheme uses earthy tones and soft colors to create a relaxing and calming look for the app's user interface.
     */
    NaturesCalm,
}
