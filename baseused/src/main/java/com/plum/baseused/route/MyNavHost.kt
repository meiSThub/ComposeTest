package com.plum.baseused.route

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.plum.baseused.ui.page.HomePage
import com.plum.baseused.ui.page.text.TextHostPage

/**
 * @Author: meixianbing
 * @Date: 2023/8/30 下午3:50
 * @Description:页面路由
 */

@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startPage: String = "homePage"
) {
    NavHost(modifier = modifier, navController = navController, startDestination = startPage) {
        // 1.首页
        composable("homePage") { HomePage(navController) }
        composable("textHost") { TextHostPage(navController) }
        composable("buttonHost") { TextHostPage(navController) }
        composable("imageHost") { TextHostPage(navController) }
        composable("imageHost") { TextHostPage(navController) }
        composable("boxHost") { TextHostPage(navController) }
        composable("rowHost") { TextHostPage(navController) }
        composable("columnHost") { TextHostPage(navController) }
        composable("lazyRowHost") { TextHostPage(navController) }
        composable("lazyColumnHost") { TextHostPage(navController) }
        composable("lazyHorizontalGridHost") { TextHostPage(navController) }
        composable("lazyVerticalGridHost") { TextHostPage(navController) }
    }
}