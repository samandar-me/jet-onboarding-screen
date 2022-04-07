package uz.context.onboardingscreenwithcompose.util

import androidx.annotation.DrawableRes
import uz.context.onboardingscreenwithcompose.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First: OnBoardingPage(
        image = R.drawable.img_1,
        title = "Java",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus consequat sit amet dui nec aliquet."
    )
    object Second: OnBoardingPage(
        image = R.drawable.img_2,
        title = "Kotlin",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus consequat sit amet dui nec aliquet."
    )
    object Third: OnBoardingPage(
        image = R.drawable.img_3,
        title = "Jetpack Compose",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus consequat sit amet dui nec aliquet."
    )
}