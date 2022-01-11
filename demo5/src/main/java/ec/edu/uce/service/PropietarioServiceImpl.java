package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.repository.IPropietarioRepo;

@Service
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepo propietarioservice;
	
	@Override
	public void CalcularDeuda() {
		//traer de la base de datos, la deuda
		//multiplicarla por el 12 porciento
		//calcularle la multa
		//...logica
		System.out.println();
		
	}

	@Override
	public void InsertarPropietario(Propietario paciente) {
		this.propietarioservice.Insertar(paciente);
	}
		
}

