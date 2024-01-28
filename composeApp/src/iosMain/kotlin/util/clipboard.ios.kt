package util

import platform.UIKit.UIPasteboard

/**
 * Platform's context.
 */
actual object PlatformContext

actual val platformContext: PlatformContext = PlatformContext

actual fun PlatformContext.getClipboardText(): String? {
    return UIPasteboard.generalPasteboard.string
}