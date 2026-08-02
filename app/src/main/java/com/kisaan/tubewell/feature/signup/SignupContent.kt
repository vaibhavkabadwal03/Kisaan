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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kisaan.tubewell.R
import com.kisaan.tubewell.core.designsystem.components.KisaanCurvedSurface
import com.kisaan.tubewell.core.designsystem.components.SegmentedControl
import com.kisaan.tubewell.core.designsystem.components.AppTextField
import com.kisaan.tubewell.core.designsystem.components.TitleBar
import com.kisaan.tubewell.core.designsystem.theme.Green
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
            title = stringResource(R.string.register),
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
                    tabs = listOf(
                        stringResource(R.string.login),
                        stringResource(R.string.register)
                    ),
                    selectedIndex = selectedTabIndex,
                    onTabSelected = onTabSelected,
                    modifier = Modifier.fillMaxWidth()
                )

                // Form Fields
                AppTextField(
                    label = stringResource(R.string.full_name),
                    value = state.fullName,
                    onValueChange = onFullNameChange
                )

                AppTextField(
                    label = stringResource(R.string.father_name),
                    value = state.fatherName,
                    onValueChange = onFatherNameChange
                )

                AppTextField(
                    label = stringResource(R.string.mobile_number),
                    value = state.mobile,
                    onValueChange = onMobileChange,
                    keyboardType = KeyboardType.Phone
                )

                AppTextField(
                    label = stringResource(R.string.password),
                    value = state.password,
                    onValueChange = onPasswordChange
                )

                AppTextField(
                    label = stringResource(R.string.confirm_password),
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
                containerColor = Green
            ),
            enabled = false
        ) {
            Text(
                text = stringResource(R.string.register),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}