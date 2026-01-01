@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    https://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  Maven wrapper batch script for Windows
@rem
@rem ##########################################################################

setlocal

set ERROR_CODE=0

@REM To isolate internal variables from possible post scripts, we use another setlocal
setlocal ENABLEDELAYEDEXPANSION

set MAVEN_CMD_LINE_ARGS=%*

if "%MAVEN_CMD_LINE_ARGS%" == "" (
  set MAVEN_CMD_LINE_ARGS=clean install
)

set MAVEN_JAVA_EXE=java.exe
if not "%JAVA_HOME%" == "" (
  if exist "%JAVA_HOME%\bin\java.exe" (
    set MAVEN_JAVA_EXE=%JAVA_HOME%\bin\java.exe
  )
)

if "%MAVEN_JAVA_EXE%"=="" (
  echo.
  echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
  echo.
  echo Please set the JAVA_HOME variable in your environment to match the
  echo location of your Java installation.
  echo.
  goto error
)

setlocal ENABLEDELAYEDEXPANSION
for /F "usebackq delims=" %%a in (`findstr /v "^@if" "%~dp0mvnw.cmd"`) do set "line=%%a" & setlocal ENABLEDELAYEDEXPANSION & set "line=!line:@@=@!" & if defined line echo(!line!
endlocal & goto :EOF

:error
set ERROR_CODE=1

@endlocal & exit /B %ERROR_CODE%
