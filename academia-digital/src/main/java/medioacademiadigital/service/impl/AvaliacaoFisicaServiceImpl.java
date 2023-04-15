package medioacademiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import medioacademiadigital.entity.Aluno;
import medioacademiadigital.entity.AvaliacaoFisica;
import medioacademiadigital.entity.form.AvaliacaoFisicaForm;
import medioacademiadigital.entity.form.AvaliacaoFisicaUpdadeForm;
import medioacademiadigital.repository.AlunoRepository;
import medioacademiadigital.repository.AvaliacaoFisicaRepository;
import medioacademiadigital.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRespository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRespository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRespository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdadeForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }

}
