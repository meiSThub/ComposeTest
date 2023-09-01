package com.plum.baseused.ui.page.text

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons.Filled
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontStyle.Companion
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.plum.baseused.ui.theme.ColorF1F7FF

/**
 * @Author: meixianbing
 * @Date: 2023/8/30 下午4:46
 * @Description:Text组件
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextHostPage(navHostController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = {
                        Log.i("TAG", "TextHostPage: ")
                        navHostController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Filled.ArrowBack,
                            contentDescription = "返回图标",
                            tint = Color.White
                        )
                    }
                },
                title = {
                    Text(
                        text = "Text",
                        color = Color.White,
                        fontSize = TextUnit(30f, TextUnitType.Sp),
                        fontStyle = FontStyle.Normal
                    )
                },
                // 设置导航栏背景色
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Blue)
            )
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
        ) {
            Text(
                text = "设置文本颜色",
                color = Color.Green
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "设置字体大小",
                fontSize = TextUnit(30f, TextUnitType.Sp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "设置斜体",
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "设置字重(如粗体)",
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "设置字符间距(letterSpacing)",
                letterSpacing = TextUnit(20f, TextUnitType.Sp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "设置下划线(textDecoration)",
                textDecoration = TextDecoration.Underline
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "设置中划线(textDecoration)",
                textDecoration = TextDecoration.LineThrough
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "居中对齐(textAlign)",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "文案左右对齐(textAlign)",
                textAlign = TextAlign.Justify,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "右对齐(textAlign)",
                textAlign = TextAlign.Right,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "文本行高(textAlign)",
                lineHeight = TextUnit(20f, TextUnitType.Sp),
                modifier = Modifier
                    .width(100.dp)
                    .background(ColorF1F7FF)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "文本超出控件范围样式（overflow）：内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容",
                overflow = TextOverflow.Visible,
                maxLines = 1
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "softWrap设置为false，超出控件范围，不会换行：内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容",
                softWrap = false
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "softWrap设置为true，超出控件范围，会换行：内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容",
                softWrap = true
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "softWrap设置为true，超出控件范围，会换行：内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容",
                onTextLayout = { textLayoutResult: TextLayoutResult ->
                    // textLayoutResult.line
                }
            )
        }
    }
}