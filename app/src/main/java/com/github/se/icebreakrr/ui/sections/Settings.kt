package com.github.se.icebreakrr.ui.sections

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.github.se.icebreakrr.ui.navigation.BottomNavigationMenu
import com.github.se.icebreakrr.ui.navigation.LIST_TOP_LEVEL_DESTINATIONS
import com.github.se.icebreakrr.ui.navigation.NavigationActions
import com.github.se.icebreakrr.ui.profile.ProfileView

/**
 * Composable function for displaying the profile screen.
 *
 * It includes a bottom navigation bar and displays the main content of the profile screen.
 *
 * @param navigationActions The actions used for navigating between screens.
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SettingsScreen(navigationActions: NavigationActions) {
  //Scaffold(
  //    modifier = Modifier.testTag("settingsScreen"),
  //    bottomBar = {
  //      BottomNavigationMenu(
  //          onTabSelect = { route -> navigationActions.navigateTo(route) },
  //          tabList = LIST_TOP_LEVEL_DESTINATIONS,
  //          selectedItem = navigationActions.currentRoute())
  //    },
  //    content = { innerPadding ->
  //      // Use the innerPadding to apply padding around your content
  //      Text(
  //          text = "Settings screen", // TODO PLaceholder
  //          modifier = Modifier.padding(innerPadding) // Applying the padding to the content
  //          )
  //    })
    ProfileView(navigationActions)
}
