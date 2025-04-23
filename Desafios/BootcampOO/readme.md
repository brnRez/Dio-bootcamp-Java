```markdown
# Desafio demonstração de Bootcamp utilizando Orientação a Objetos

Entrega do desafio de orientação a objetos no qual abstraímos o conceito de um bootcamp, utilizando do objeto Dev como base para a progressão do curso, podendo se inscrever num bootcamp, obtendo conteúdos, progredir nos conteúdos inscritos e obter Xp de tal forma.

## Diagrama

```mermaid

classDiagram
    class Bootcamp {
        - String name
        - String description
        - List<Content> contents
        + enrollDev(Dev dev)
        + calculateTotalXP(): int
    }

    class Content {
        <<abstract>>
        - String title
        - String description
        + calculateXP(): int
    }

    class Course {
        - int workload
        + calculateXP(): int
    }

    class Mentorship {
        - LocalDate date
        + calculateXP(): int
    }

    class Dev {
        - String name
        - List<Content> enrolledContents
        - List<Content> completedContents
        + enrollInBootcamp(Bootcamp bootcamp)
        + progress()
        + calculateTotalXP(): int
    }

    Bootcamp "1" --> "many" Content
    Content <|-- Course
    Content <|-- Mentorship
    Bootcamp "many" --> "many" Dev
    Dev "many" --> "many" Content
