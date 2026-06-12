$ErrorActionPreference = 'Continue'
Set-Location C:\Users\Min\.qclaw\workspace-agent-279f079a\blbl

git checkout HEAD -- app/src/main/java/blbl/cat3399/core/api/BiliApi.kt
Write-Host 'BiliApi restored'
git checkout HEAD -- app/src/main/java/blbl/cat3399/core/api/LiveApi.kt
Write-Host 'LiveApi restored'

./gradlew compileDebugKotlin --no-daemon 2>&1

$exit = $LASTEXITCODE
Write-Host "EXIT: $exit"
