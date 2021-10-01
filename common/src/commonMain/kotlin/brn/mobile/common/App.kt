package brn.mobile.common
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.widget.ConstraintLayout

@Composable()
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Button(onClick = {
            text = "Hello, ${getPlatformName().decapitalize().reversed()}"
        }) {
            Text(text)
        }
    }

//
//    @Composable()
//    @Preview()
//    fun AndroidPreview_Frame_1153() {
//        Box(Modifier.preferredSize(360.dp, 640.dp)) {
//            Frame_1153()
//        }
//    }
//
//    @Composable()
//    fun Frame_1153() {
//        Frame_1153(Modifier.fillMaxSize())
//    }
//
//    @Composable()
//    fun =5@5G52K5_C_@(modifier: Modifier = Modifier) {
//        ConstraintLayout(modifier) {
//            val (Rectangle_135, 5@5G52K5_C_@06=5=8O, Rectangle_136) = createRefs()
//
//
//            Box(Modifier.clip(RoundedCornerShape(8.0.dp)).preferredSize(413.0.dp, 315.0.dp).drawBackground(Color(0.96f, 0.96f, 0.96f, 1.0f)).constrainAs(Rectangle_135) {
//                centerTo(parent)
//                width = Dimension.fillToConstraints
//                height = Dimension.fillToConstraints
//            }){}
//
//            Text("5@5G52K5 C?@06=5=8O", Modifier.wrapContentHeight(Alignment.Top).constrainAs(5@5G52K5_C_@06=5=8O) {
//                linkTo(parent.start, parent.end, bias = 0.5f)
//                linkTo(parent.top, parent.bottom, bias = 0.9f)
//                width = Dimension.percent(0.58f)
//                height = Dimension.percent(0.1f)
//            }, style = AmbientTextStyle.current.copy(color = Color(0.09f, 0.09f, 0.1f, 1.0f), textAlign = TextAlign.Left, fontSize = 18.0.sp))
//
//            Box(Modifier.clip(RoundedCornerShape(12.0.dp, 12.0.dp, 0.0.dp, 0.0.dp)).preferredSize(413.0.dp, 230.0.dp).drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f)).constrainAs(Rectangle_136) {
//                linkTo(parent.start, parent.end, bias = 0.5f)
//                linkTo(parent.top, parent.bottom, bias = 0.0f)
//                width = Dimension.percent(1.0f)
//                height = Dimension.percent(0.73f)
//            }){}
//
//        }
//    }
//    @Composable()
//    fun Frame_1158(modifier: Modifier = Modifier) {
//        ConstraintLayout(modifier.drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f))) {
//            val (Logo, Frame_1187, Frame_1165, Group_555) = createRefs()
//
//
//            ConstraintLayout(Modifier.constrainAs(Logo) {
//                start.linkTo(parent.start, 64.0.dp)
//                top.linkTo(parent.top, 40.0.dp)
//                width = Dimension.value(119.0.dp)
//                height = Dimension.value(40.0.dp)
//            }) {
//                val (BrainUP) = createRefs()
//
//
//                Text("BrainUP", Modifier.wrapContentHeight(Alignment.Top).constrainAs(BrainUP) {
//                    start.linkTo(parent.start, 3.0.dp)
//                    top.linkTo(parent.top, 0.0.dp)
//                    width = Dimension.value(113.0.dp)
//                    height = Dimension.value(40.0.dp)
//                }, style = AmbientTextStyle.current.copy(color = Color(0.0f, 0.0f, 0.0f, 1.0f), textAlign = TextAlign.Left, fontSize = 40.0.sp))
//
//            }
//            ConstraintLayout(Modifier.constrainAs(Frame_1187) {
//                start.linkTo(parent.start, 243.0.dp)
//                top.linkTo(parent.top, 49.0.dp)
//                width = Dimension.value(784.0.dp)
//                height = Dimension.value(24.0.dp)
//            }) {
//                val (Group_554) = createRefs()
//
//
//                Box() {
//                    Text(";02=0O", Modifier.wrapContentHeight(Alignment.Top), style = AmbientTextStyle.current.copy(color = Color(0.08f, 0.07f, 0.07f, 0.5f), textAlign = TextAlign.Left, fontSize = 18.0.sp))
//
//                    Text("03@04K", Modifier.wrapContentHeight(Alignment.Top), style = AmbientTextStyle.current.copy(color = Color(0.08f, 0.07f, 0.07f, 0.5f), textAlign = TextAlign.Left, fontSize = 18.0.sp))
//
//                    Text("!B0B8AB8:0", Modifier.wrapContentHeight(Alignment.Top), style = AmbientTextStyle.current.copy(color = Color(0.08f, 0.07f, 0.07f, 0.5f), textAlign = TextAlign.Left, fontSize = 18.0.sp))
//
//                    Text("#?@06=5=8O", Modifier.wrapContentHeight(Alignment.Top), style = AmbientTextStyle.current.copy(color = Color(0.08f, 0.07f, 0.07f, 1.0f), textAlign = TextAlign.Left, fontSize = 18.0.sp))
//
//                    Text(">AB865=8O", Modifier.wrapContentHeight(Alignment.Top), style = AmbientTextStyle.current.copy(color = Color(0.08f, 0.07f, 0.07f, 0.5f), textAlign = TextAlign.Left, fontSize = 18.0.sp))
//
//                }
//            }
//            ConstraintLayout(Modifier.drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f)).constrainAs(Frame_1165) {
//                start.linkTo(parent.start, 1144.0.dp)
//                top.linkTo(parent.top, 36.0.dp)
//                width = Dimension.value(260.0.dp)
//                height = Dimension.value(48.0.dp)
//            }) {
//                val (Group_447, A5=8O__07C_=8__20) = createRefs()
//
//
//                Box() {
//
//                }
//                Text("A5=8O( 07C<=8:>20", Modifier.wrapContentHeight(Alignment.Top).constrainAs(A5=8O__07C_=8__20) {
//                    start.linkTo(parent.start, 62.0.dp)
//                    top.linkTo(parent.top, 2.0.dp)
//                    width = Dimension.value(134.0.dp)
//                    height = Dimension.value(44.0.dp)
//                }, style = AmbientTextStyle.current.copy(color = Color(0.0f, 0.0f, 0.0f, 1.0f), textAlign = TextAlign.Left, fontSize = 16.0.sp))
//
//            }
//            Box() {
//
//                Text("25.0", Modifier.wrapContentHeight(Alignment.Top), style = AmbientTextStyle.current.copy(color = Color(0.26f, 0.55f, 0.99f, 1.0f), textAlign = TextAlign.Left, fontSize = 14.0.sp))
//
//            }
//        }
//    }
//    @Composable()
//    fun @5G52K5_C_@(modifier: Modifier = Modifier) {
//        ConstraintLayout(modifier) {
//            val (Rectangle_135, _5G52K5_C_@06=5=8O, Rectangle_136) = createRefs()
//
//
//            Box(Modifier.clip(RoundedCornerShape(8.0.dp)).preferredSize(413.0.dp, 315.0.dp).drawBackground(Color(0.96f, 0.96f, 0.96f, 1.0f)).constrainAs(Rectangle_135) {
//                centerTo(parent)
//                width = Dimension.fillToConstraints
//                height = Dimension.fillToConstraints
//            }){}
//
//            Text(" 5G52K5 C?@06=5=8O", Modifier.wrapContentHeight(Alignment.Top).constrainAs(_5G52K5_C_@06=5=8O) {
//                linkTo(parent.start, parent.end, bias = 0.5f)
//                linkTo(parent.top, parent.bottom, bias = 0.91f)
//                width = Dimension.percent(0.51f)
//                height = Dimension.percent(0.1f)
//            }, style = AmbientTextStyle.current.copy(color = Color(0.09f, 0.09f, 0.1f, 1.0f), textAlign = TextAlign.Left, fontSize = 18.0.sp))
//
//            Box(Modifier.clip(RoundedCornerShape(12.0.dp, 12.0.dp, 0.0.dp, 0.0.dp)).preferredSize(413.0.dp, 230.0.dp).drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f)).constrainAs(Rectangle_136) {
//                linkTo(parent.start, parent.end, bias = 0.5f)
//                linkTo(parent.top, parent.bottom, bias = 0.0f)
//                width = Dimension.percent(1.0f)
//                height = Dimension.percent(0.73f)
//            }){}
//
//        }
//    }
//
//    @Composable()
//    @Preview()
//    fun AndroidPreview_C_@06=5=8O() {
//        Box(Modifier.preferredSize(360.dp, 640.dp)) {
//            C_@06=5=8O()
//        }
//    }
//
//    @Composable()
//    fun C_@06=5=8O() {
//        ConstraintLayout(Modifier.drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f)).fillMaxSize()) {
//            val (0209B5_2K15@5____0_85_C_@06=5=8O_1C45__45;0BL_A53_4=O_, =5@5G52K5_C_@, @5G52K5_C_@, Frame_1158) = createRefs()
//
//
//            Text("0209B5 2K15@5<, :0:85 C?@06=5=8O 1C45< 45;0BL A53>4=O?", Modifier.wrapContentHeight(Alignment.Top).constrainAs(0209B5_2K15@5____0_85_C_@06=5=8O_1C45__45;0BL_A53_4=O_) {
//            start.linkTo(parent.start, 264.0.dp)
//            top.linkTo(parent.top, 277.0.dp)
//            width = Dimension.value(795.0.dp)
//            height = Dimension.value(45.0.dp)
//        }, style = AmbientTextStyle.current.copy(color = Color(0.0f, 0.0f, 0.0f, 1.0f), textAlign = TextAlign.Left, fontSize = 24.0.sp))
//
//            =5@5G52K5_C_@(Modifier.constrainAs(=5@5G52K5_C_@) {
//            start.linkTo(parent.start, 266.0.dp)
//            top.linkTo(parent.top, 362.0.dp)
//            width = Dimension.value(413.0.dp)
//            height = Dimension.value(315.0.dp)
//        })
//            @5G52K5_C_@(Modifier.constrainAs(@5G52K5_C_@) {
//                start.linkTo(parent.start, 719.0.dp)
//                top.linkTo(parent.top, 362.0.dp)
//                width = Dimension.value(413.0.dp)
//                height = Dimension.value(315.0.dp)
//            })
//            Frame_1158(Modifier.constrainAs(Frame_1158) {
//                start.linkTo(parent.start, 0.0.dp)
//                top.linkTo(parent.top, 0.0.dp)
//                width = Dimension.value(1440.0.dp)
//                height = Dimension.value(120.0.dp)
//            })
//        }
//    }
}
