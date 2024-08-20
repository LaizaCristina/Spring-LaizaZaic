


@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin

public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public Lista<Usuario> todosUsuarios() {
        return service.todosUsuarios();
        

    }


}
