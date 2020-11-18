package fr.softeam.cameldesigner.elementmodel.importer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import camel.core.CamelModel;
import camel.core.CorePackage;
import camel.dsl.math.ExpressionChecker;
import camel.metric.CompositeMetric;
import camel.metric.Metric;
import camel.metric.MetricModel;
import camel.metric.MetricTypeModel;
import camel.metric.MetricVariable;
import camel.unit.CompositeUnit;
import camel.unit.Unit;
import camel.unit.UnitModel;
import com.google.inject.Injector;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.conversion.CamelDslManager;
import fr.softeam.cameldesigner.conversion.process.reverse.ReverseProcess;
import fr.softeam.cameldesigner.elementmodel.walker.camelwalker.AbstractCamelWalker;
import fr.softeam.cameldesigner.elementmodel.walker.camelwalker.CamelWalker;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.modelio.metamodel.uml.statik.Package;

public class ImporterService {
    private Object loadOption;

    public ImporterService(Object loadOption) {
        super();
        this.loadOption = loadOption;
    }

    public void importModelFromFile(Package packageOwner, String filePath) {
        Injector injector = CamelDslManager.getInstance().getInjector();
        
        //        Registry inst = Resource.Factory.Registry.INSTANCE;
        //        org.eclipse.xtext.resource.IResourceServiceProvider.Registry inst2 = IResourceServiceProvider.Registry.INSTANCE;
        
        
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.getPackageRegistry().put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
        resourceSet.addLoadOption(this.loadOption, Boolean.TRUE);
        Resource resource = resourceSet.getResource(URI.createFileURI(filePath), true);
        CamelModel camelModel = (CamelModel)resource.getContents().get(0);
        //enrichModel(camelModel);
        
        //UpdateCamelModelReferences.updateCamelModel(camelModel);
        
        Map<CDOObject, CamelElement> processedCamelElements = new HashMap<>();
        ReverseProcess reverseProcess = new ReverseProcess(packageOwner, processedCamelElements);
        AbstractCamelWalker camelWalker = new CamelWalker (reverseProcess);
        camelWalker.walk(camelModel);
    }

    private static void enrichModel(final CamelModel camelModel) {
        EList<MetricModel> _metricModels = camelModel.getMetricModels();
        for (final MetricModel mm : _metricModels) {
            if ((mm instanceof MetricTypeModel)) {
                enrichMetricModel(((MetricTypeModel) mm));
            }
        }
        EList<UnitModel> _unitModels = camelModel.getUnitModels();
        for (final UnitModel um : _unitModels) {
            enrichUnitModel(um);
        }
    }

    private static void enrichMetricModel(final MetricTypeModel mm) {
        final HashMap<String, Metric> metrics = new HashMap<>();
        final ArrayList<CompositeMetric> compMetrics = new ArrayList<>();
        final ArrayList<MetricVariable> metrVars = new ArrayList<>();
        EList<Metric> _metrics = mm.getMetrics();
        for (final Metric m : _metrics) {
            {
                metrics.put(m.getName(), m);
                if ((m instanceof CompositeMetric)) {
                    compMetrics.add(((CompositeMetric)m));
                } else {
                    if (((m instanceof MetricVariable) && (((MetricVariable) m).getFormula() != null))) {
                        metrVars.add(((MetricVariable) m));
                    }
                }
            }
        }
        for (final CompositeMetric m_1 : compMetrics) {
            {
                final String[] args = ExpressionChecker.getArguments(m_1.getFormula());
                if ((args != null)) {
                    for (final String s : args) {
                        {
                            final Metric metr = metrics.get(s);
                            if ((metr != null)) {
                                m_1.getComponentMetrics().add(metr);
                            }
                        }
                    }
                }
            }
        }
        for (final MetricVariable m_2 : metrVars) {
            {
                final String[] args = ExpressionChecker.getArguments(m_2.getFormula());
                if ((args != null)) {
                    for (final String s : args) {
                        {
                            final Metric metr = metrics.get(s);
                            if ((metr != null)) {
                                m_2.getComponentMetrics().add(metr);
                            }
                        }
                    }
                }
            }
        }
    }

    private static void enrichUnitModel(final UnitModel um) {
        final HashMap<String, Unit> units = new HashMap<>();
        final ArrayList<CompositeUnit> compUnits = new ArrayList<>();
        EList<Unit> _units = um.getUnits();
        for (final Unit u : _units) {
            {
                units.put(u.getName(), u);
                if ((u instanceof CompositeUnit)) {
                    compUnits.add(((CompositeUnit)u));
                }
            }
        }
        for (final CompositeUnit u_1 : compUnits) {
            {
                final String[] args = ExpressionChecker.getArguments(u_1.getFormula());
                if ((args != null)) {
                    for (final String s : args) {
                        {
                            final Unit unit = units.get(s);
                            if ((unit != null)) {
                                u_1.getComponentUnits().add(unit);
                            }
                        }
                    }
                }
            }
        }
    }

}
