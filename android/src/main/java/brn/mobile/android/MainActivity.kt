package brn.mobile.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.widget.ConstraintLayout
import brn.mobile.common.App

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
//        @Composable()
//        @Preview()
//        fun Frame_1153(modifier: Modifier.fillMaxSize()) {
//            ConstraintLayout(modifier.drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f))) {
//                val (Logo, Frame_958) = FocusRequester.createRefs()
//
//
//                ConstraintLayout(Modifier.constrainAs(Logo) {
//                    start.linkTo(parent.start, 64.0.dp)
//                    top.linkTo(parent.top, 40.0.dp)
//                    width = Dimension.value(119.0.dp)
//                    height = Dimension.value(40.0.dp)
//                }) {
//                    val (BrainUP) = FocusRequester.createRefs()
//
//
//                    Text("BrainUP", Modifier.wrapContentHeight(Alignment.Top).constrainAs(BrainUP) {
//                        start.linkTo(parent.start, 3.0.dp)
//                        top.linkTo(parent.top, 0.0.dp)
//                        width = Dimension.value(113.0.dp)
//                        height = Dimension.value(40.0.dp)
//                    }, style = AmbientTextStyle.current.copy(color = Color(0.0f, 0.0f, 0.0f, 1.0f), textAlign = TextAlign.Left, fontSize = 40.0.sp))
//
//                }
//                ConstraintLayout(Modifier.clip(RoundedCornerShape(8.0.dp)).drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f)).constrainAs(Frame_958) {
//                    start.linkTo(parent.start, 1149.0.dp)
//                    top.linkTo(parent.top, 36.0.dp)
//                    width = Dimension.value(227.0.dp)
//                    height = Dimension.value(48.0.dp)
//                }) {
//                    val (_538AB@0F8O) = createRefs()
//
//
//                    Text(" 538AB@0F8O", Modifier.wrapContentHeight(Alignment.CenterVertically).constrainAs(_538AB@0F8O) {
//                        start.linkTo(parent.start, 51.0.dp)
//                        top.linkTo(parent.top, 12.0.dp)
//                        width = Dimension.value(125.0.dp)
//                        height = Dimension.value(24.0.dp)
//                    }, style = AmbientTextStyle.current.copy(color = Color(0.26f, 0.55f, 0.99f, 1.0f), textAlign = TextAlign.Center, fontSize = 18.0.sp))
//
//                }
//            }
//        }
    }
}
//    @Composable()
//    fun Frame_1153(modifier: Modifier = Modifier) {
//        ConstraintLayout(modifierdrawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f))) {
//            val (Logo, Frame_958) = createRefs()
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
//            ConstraintLayout(Modifier.clip(RoundedCornerShape(8.0.dp)).drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f)).constrainAs(Frame_958) {
//                start.linkTo(parent.start, 1149.0.dp)
//                top.linkTo(parent.top, 36.0.dp)
//                width = Dimension.value(227.0.dp)
//                height = Dimension.value(48.0.dp)
//            }) {
//                val (_538AB@0F8O) = createRefs()
//
//
//                Text(" 538AB@0F8O", Modifier.wrapContentHeight(Alignment.CenterVertically).constrainAs(_538AB@0F8O) {
//                    start.linkTo(parent.start, 51.0.dp)
//                    top.linkTo(parent.top, 12.0.dp)
//                    width = Dimension.value(125.0.dp)
//                    height = Dimension.value(24.0.dp)
//                }, style = AmbientTextStyle.current.copy(color = Color(0.26f, 0.55f, 0.99f, 1.0f), textAlign = TextAlign.Center, fontSize = 18.0.sp))
//
//            }
//        }
//    }
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
//
// }
/*
 @Composable()
        fun Frame_1153(modifier: Modifier = Modifier) {
                        ConstraintLayout(modifier.drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f))) {
                val (Logo, Frame_958) = createRefs()


                             ConstraintLayout(Modifier.constrainAs(Logo) {
    start.linkTo(parent.start, 64.0.dp)
top.linkTo(parent.top, 40.0.dp)
width = Dimension.value(119.0.dp)
height = Dimension.value(40.0.dp)
}) {
                val (BrainUP) = createRefs()


                                 Text("BrainUP", Modifier.wrapContentHeight(Alignment.Top).constrainAs(BrainUP) {
    start.linkTo(parent.start, 3.0.dp)
top.linkTo(parent.top, 0.0.dp)
width = Dimension.value(113.0.dp)
height = Dimension.value(40.0.dp)
}, style = AmbientTextStyle.current.copy(color = Color(0.0f, 0.0f, 0.0f, 1.0f), textAlign = TextAlign.Left, fontSize = 40.0.sp))

            }
            ConstraintLayout(Modifier.clip(RoundedCornerShape(8.0.dp)).drawBackground(Color(1.0f, 1.0f, 1.0f, 1.0f)).constrainAs(Frame_958) {
    start.linkTo(parent.start, 1149.0.dp)
top.linkTo(parent.top, 36.0.dp)
width = Dimension.value(227.0.dp)
height = Dimension.value(48.0.dp)
}) {
                val (_538AB@0F8O) = createRefs()


                                 Text(" 538AB@0F8O", Modifier.wrapContentHeight(Alignment.CenterVertically).constrainAs(_538AB@0F8O) {
    start.linkTo(parent.start, 51.0.dp)
top.linkTo(parent.top, 12.0.dp)
width = Dimension.value(125.0.dp)
height = Dimension.value(24.0.dp)
}, style = AmbientTextStyle.current.copy(color = Color(0.26f, 0.55f, 0.99f, 1.0f), textAlign = TextAlign.Center, fontSize = 18.0.sp))

            }
            }
        }

                    @Composable()
@Preview()
fun AndroidPreview_Frame_1153() {
    Box(Modifier.preferredSize(360.dp, 640.dp)) {
        Frame_1153()
    }
}

@Composable()
fun Frame_1153() {
    Frame_1153(Modifier.fillMaxSize())
}
 */
