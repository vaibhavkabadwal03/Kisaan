package com.kisaan.tubewell.core.designsystem.components

import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun SegmentedControl(
    tabs: List<String>,
    selectedIndex: Int,
    onTabSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    SingleChoiceSegmentedButtonRow(modifier = modifier) {
        tabs.forEachIndexed { index, tab ->
            SegmentedButton(
                selected = selectedIndex == index,
                onClick = { onTabSelected(index) },
                shape = SegmentedButtonDefaults.itemShape(
                    index = index,
                    count = tabs.size
                ),
                label = {
                    Text(
                        text = tab,
                        fontWeight = if (selectedIndex == index)
                            FontWeight.Bold else FontWeight.Normal
                    )
                }
            )
        }
    }
}