/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << MetricModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("51d9d8d2-09df-43a4-afb2-46e9551ee43b")
public abstract class MetricModel extends SubModel {
    @objid ("8c59c5ef-455c-48e0-81ed-5575142c8261")
    public static final String STEREOTYPE_NAME = "MetricModel";

    /**
     * Tells whether a {@link MetricModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("35a2a158-210b-49c7-b5f5-736e1bbcac0f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricModel.STEREOTYPE_NAME));
    }

    @objid ("3decf056-4384-4265-a8bb-e001e4d682df")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MetricModel other = (MetricModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("f7bb980f-6257-423b-bbb0-009d93d2681a")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("2feaec8e-f16a-4ef9-a7aa-9154b0ee6419")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fb2e1e36-0961-44ef-9111-df5f02d3922a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("390a5e7e-7be5-41b8-9dfd-1f86d7b364b9")
    protected MetricModel(final Package elt) {
        super(elt);
    }

    @objid ("e2df5621-cc23-4f96-99f5-e13e4b7f8425")
    public static final class MdaTypes {
        @objid ("ed09fa11-d90c-4ae3-871d-5e69949bf0d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("15f446b8-7c6e-4336-89e3-c61e2f791968")
        private static Stereotype MDAASSOCDEP;

        @objid ("5596ca78-d6d1-414c-9315-2e8775df16bf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("261423f0-6e34-48b9-aee6-fcab11843260")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e9c199d4-1f22-4720-a79c-39ebaf36e7bb");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
