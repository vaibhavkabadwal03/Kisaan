package com.kisaan.tubewell.feature.signup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kisaan.tubewell.R
import com.kisaan.tubewell.core.designsystem.components.KisaanCurvedSurface
import com.kisaan.tubewell.core.designsystem.components.SegmentedControl
import com.kisaan.tubewell.core.designsystem.components.FormField
import com.kisaan.tubewell.core.designsystem.components.TitleBar

@Composable
fun SignupContent(
    state: SignupUIState = SignupUIState(),
    selectedTabIndex: Int = 1,
    onTabSelected: (Int) -> Unit,
    onFullNameChange: (String) -> Unit,
    onFatherNameChange: (String) -> Unit,
    onMobileChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onConfirmPasswordChange: (String) -> Unit,
    onSignupClick: () -> Unit,
) {
    Column(modifier = Modifier.fillMaxSize()) {
        // Top App Bar — Green
        TitleBar(
            title = R.string.register,
            subtitle = "",
        )

        // Curved white/cream surface
        KisaanCurvedSurface(
            modifier = Modifier.weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 20.dp, vertical = 24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                // Segmented Control
                SegmentedControl(
                    tabs = listOf(R.string.login.toString(), R.string.register.toString()),
                    selectedIndex = selectedTabIndex,
                    onTabSelected = onTabSelected,
                    modifier = Modifier.fillMaxWidth()
                )

                // Form Fields
                FormField(
                    label = R.string.full_name,
                    value = state.fullName,
                    onValueChange = onFullNameChange
                )

                FormField(
                    label = R.string.father_name,
                    value = state.fatherName,
                    onValueChange = onFatherNameChange
                )

                FormField(
                    label = R.string.mobile_number,
                    value = state.mobile,
                    onValueChange = onMobileChange,
                    keyboardType = KeyboardType.Phone
                )

                FormField(
                    label = R.string.password,
                    value = state.password,
                    onValueChange = onPasswordChange
                )

                FormField(
                    label = R.string.confirm_password,
                    value = state.confirmPassword,
                    onValueChange = onConfirmPasswordChange
                )
            }
        }

        // Bottom CTA Button
        Button(
            onClick = onSignupClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(R.color.green)
            )
        ) {
            Text(
                text = R.string.register.toString(),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}