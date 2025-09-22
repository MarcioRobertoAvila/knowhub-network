{ pkgs }: {
  deps = [
    pkgs.jdk        # JDK padrão
    pkgs.gradle
    pkgs.git
  ];
}