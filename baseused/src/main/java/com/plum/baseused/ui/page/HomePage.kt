package com.plum.baseused.ui.page

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells.Fixed
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

/**
 * @Author: meixianbing
 * @Date: 2023/8/30 下午4:00
 * @Description:首页
 */

data class HomeItemBean(
    val name: String = "",
    val route: String = ""
)

private fun dataList(): List<HomeItemBean> {
    return mutableListOf(
        HomeItemBean("Text", "textHost"),
        HomeItemBean("Button", "buttonHost"),
        HomeItemBean("Image", "imageHost"),
        HomeItemBean("Box", "boxHost"),
        HomeItemBean("Row", "rowHost"),
        HomeItemBean("Column", "columnHost"),
        HomeItemBean("LazyRow", "lazyRowHost"),
        HomeItemBean("LazyColumn", "lazyColumnHost"),
        HomeItemBean("LazyHorizontalGrid", "lazyHorizontalGridHost"),
        HomeItemBean("LazyVerticalGrid", "lazyVerticalGridHost"),
    )
}


@Composable
fun HomePage(navHostController: NavHostController) {
    HomeContent(dataList(), navHostController)
}


@Composable
fun HomeContent(list: List<HomeItemBean>, navHostController: NavHostController) {
    LazyVerticalGrid(columns = Fixed(4), content = {
        items(list.size) { position ->
            ItemView(list[position], navHostController)
        }
    })
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ItemView(data: HomeItemBean, navHostController: NavHostController) {
    Row(
        modifier = Modifier
            .padding(10.dp)
            .background(Color.White)
            .clickable {
                Log.i("ItemView", "ItemView: route(${data.route})")
                navHostController.navigate(data.route)
            }
            .padding(10.dp)
            .height(100.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = data.name, color = Color.Blue)
    }
}