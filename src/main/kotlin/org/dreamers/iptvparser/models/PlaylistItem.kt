package org.dreamers.iptvparser.models

/**
 * M3U8 playlist item.
 *
 * @param title Media title.
 * @param attributes Map of media attributes.
 * @param headers Map of request headers for media.
 * @param url Url of media.
 * @param userAgent User Agent string.
 */
data class PlaylistItem(
    val title: String? = null,
    val attributes: Map<String, String> = emptyMap(),
    val headers: Map<String, String> = emptyMap(),
    val url: String? = null,
    val userAgent: String? = null,
)