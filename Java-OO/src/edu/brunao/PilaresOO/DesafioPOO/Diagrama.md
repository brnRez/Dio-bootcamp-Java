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
        <<Interface>> ReprodutorVisual
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

    ReprodutorMusical --> DispositivoMovel : implements
    Telefone --> DispositivoMovel : implements
    Navegador --> DispositivoMovel : implements
    ReprodutorVisual --> DispositivoMovel : implements

    DispositivoMovel --> IPhone : extends