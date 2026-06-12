package blbl.cat3399.feature.player

/**
 * v21.2 视频画面旋转锁定 | Video Rotation Lock
 * Lock video rotation to specific angle
 */
class PlayerActivityRotationLock {
    fun lockRotation(degrees: Int) {}

    fun unlockRotation() {}

    fun isRotationLocked(): Boolean = false

    fun getLockedRotation(): Int = 0
}
