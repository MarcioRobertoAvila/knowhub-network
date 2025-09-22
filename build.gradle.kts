plugins {
  id("com.diffplug.spotless") version "6.25.0"
  id("io.gitlab.arturbosch.detekt") version "1.23.6"
}

// Formatação com ktlint (para .kt e .kts)
spotless {
  kotlin {
    target("**/*.kt")
    ktlint("1.3.1")
  }
  kotlinGradle {
    target("**/*.kts")
    ktlint("1.3.1")
  }
  format("misc") {
    target("**/*.{md,gitignore}")
    trimTrailingWhitespace()
    indentWithSpaces(2)
    endWithNewline()
  }
}

// Lint Kotlin
detekt {
  buildUponDefaultConfig = true
  allRules = false
  autoCorrect = false
}