@Echo off
cd ..
::robocopy of jar
echo Copied jar outside dev-environment
robocopy build\libs\ _automation > nul
TIMEOUT /NOBREAK /T 1 > nul
echo ##Execution completed##