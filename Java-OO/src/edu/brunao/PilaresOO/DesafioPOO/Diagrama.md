```mermaid
classDiagram

    class ReprodutorMusical {
    <<interface>> ReprodutorMusical
        +abrirReprodutorMusical()
        +selecionarMusica()
        +tocar()
        +pausar()
        +voltarMenuMusica()
    }

    class Telefone {
    <<interface>> Telefone 
        +abrirTelefone()
        +ligar()
        +atender()
        +iniciarCorreioVoz()
        +selecionarCorreioVoz()
    }

    class Navegador {
    <<interface>> Navegador
        +abrirNavegador()
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    class ReprodutorVisual{
    <<interface>> ReprodutorVisual
        +abrirReprodutorVisual()
        +selecionarVideo()
        +pausarVideo()
        +retomarVideo()
        +voltarMenuVideo()
    }
    
    class DispositivoMovel{

    }

    class iPhone {
        +main(String [] args)
        
    }

    ReprodutorMusical --> DispositivoMovel : implements
    AparelhoTelefonico --> DispositivoMovel : implements
    NavegadorInternet --> DispositivoMovel : implements
    ReprodutorVisual --> DispositivoMovel : implements

    DispositivoMovel --> IPhone : extends