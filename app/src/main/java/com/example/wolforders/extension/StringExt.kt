package com.qubiz.qbuzz.extension

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.text.SimpleDateFormat
import java.util.*

const val EMAIL_REGEX =
    "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"
const val PHONE_REGEX = "^([0-9\\\\+]|\\\\(\\\\d{1,3}\\\\))[0-9\\\\. ]{3,15}\$"
const val PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!?@#$%^&+=])(?=\\S+$).{6,}$"
const val UTC_REGEX =
    "^\\d{4}-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\d(\\.\\d+)?(([+-]\\d\\d:\\d\\d)|Z)?\$"
const val UTC_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS"
private const val TEXT_CONTENT_TYPE = "text/plain"
private const val SUBSTRING_MAX_NUMBER = 2

fun String?.getInitials(): String {
    if (this == null || this.isBlank()) {
        return ""
    }
    return split(' ', limit = SUBSTRING_MAX_NUMBER)
        .mapNotNull { it.firstOrNull()?.toString() }
        .reduce { acc, s -> acc + s }
}

fun String.isEmailValid(): Boolean {
    val matcher = Regex(EMAIL_REGEX)
    return matcher.find(this) != null
}

fun String.isPhoneValid(): Boolean {
    val matcher = Regex(PHONE_REGEX)
    return matcher.find(this) != null
}

fun String.dateInFormat(format: String): Date? {
    val dateFormat = SimpleDateFormat(format, Locale.getDefault())
    return dateFormat.parse(this)
}

fun String.convertToCalendar(format: String): Calendar {
    val calendar = Calendar.getInstance()
    this.dateInFormat(format)?.let { date ->
        calendar.time = date
    }
    return calendar
}

fun String.isPasswordValid(): Boolean {
    val passwordMatcher = Regex(PASSWORD_REGEX)
    return passwordMatcher.find(this) != null
}

fun String.fromUTCToDate(): Date? {
    val tz = TimeZone.getTimeZone("UTC")
    val parser = SimpleDateFormat(UTC_DATE_PATTERN, Locale.getDefault())
    parser.timeZone = tz
    return parser.parse(this)
}

fun String.convertStringToList(separator: String): List<String> {
    return this.split(separator).map { it.trim() }.filter { it.isNotEmpty() }
}

fun String.transformToRequestBody(): RequestBody {
    return toRequestBody(TEXT_CONTENT_TYPE.toMediaTypeOrNull())
}