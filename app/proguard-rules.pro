# Keep protobuf lite
-keep class com.google.protobuf.** { *; }
-dontwarn com.google.protobuf.**

# Protobuf generated messages (app/src/main/proto) are parsed via GeneratedMessageLite
# and rely on field names like `xxx_` at runtime; R8 obfuscation of these fields breaks parsing.
# Keep all lite message classes by base type so future grpc/proto additions are
# protected regardless of their proto `java_package`.
-keep class ** extends com.google.protobuf.GeneratedMessageLite { *; }
-keep class ** extends com.google.protobuf.GeneratedMessageLite$Builder { *; }

# Keep known generated packages too. This covers generated outer classes and
# grpc descriptors that do not themselves extend GeneratedMessageLite.
-keep class blbl.cat3399.proto.** { *; }
-keep class bilibili.** { *; }
-keep class common.** { *; }
-keep class **Grpc { *; }
-keep class **Grpc$* { *; }

# Keep IjkPlayer Java API names (JNI depends on stable class/method/field names).
# Without this, release (R8) obfuscation can make `libijkplayer.so` fail to bind and crash on startup.
-keep class tv.danmaku.ijk.** { *; }
-keep class com.debugly.ijkplayer.** { *; }

# Keep generated settings code (PlayerSettingsPart*, FeaturePrefs*)
-keep class blbl.cat3399.feature.player.PlayerSettingsPart* { *; }
-keep class blbl.cat3399.core.prefs.FeaturePrefs* { *; }
-keep class blbl.cat3399.core.prefs.AppPrefs { *; }

# Keep SharedPreferences key constants
-keepclassmembers class blbl.cat3399.core.prefs.** {
    static final java.lang.String KEY_*;
}
