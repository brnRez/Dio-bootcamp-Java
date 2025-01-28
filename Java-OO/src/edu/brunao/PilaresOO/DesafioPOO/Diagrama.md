```mermaid
classDiagram

    class ReprodutorMusical {
        <<interface>>
        +abrirReprodutorMusical()
        +selecionarMusica()
        +tocar()
        +pausar()
        +voltarMenuMusica()
    }

    class Telefone {
        <<interface>> 
        +abrirTelefone()
        +ligar()
        +atender()
        +iniciarCorreioVoz()
        +selecionarCorreioVoz()
    }

    class Navegador {
        <<interface>>
        +abrirNavegador()
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    class ReprodutorVisual{
        <<Interface>>
        +abrirReprodutorVisual()
        +selecionarVideo()
        +pausarVideo()
        +retomarVideo()
        +voltarMenuVideo()
    }
    
    class DispositivoMovel{

    }

    class IPhone {
        +main(String [] args)
        
    }

    DispositivoMovel <-- ReprodutorMusical : implements
    DispositivoMovel <-- Telefone : implements
    DispositivoMovel <-- Navegador : implements
    DispositivoMovel <-- ReprodutorVisual : implements

    IPhone <-- DispositivoMovel : extends
