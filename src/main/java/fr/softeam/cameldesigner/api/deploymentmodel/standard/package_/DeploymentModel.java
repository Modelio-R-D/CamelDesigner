/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
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
 * Proxy class to handle a {@link Package} with << DeploymentModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6e4c7b4b-d381-4e52-a43d-fcb0cea6173f")
public abstract class DeploymentModel extends SubModel {
    @objid ("a7b93356-7011-4aca-a20d-17acf5fc96d3")
    public static final String STEREOTYPE_NAME = "DeploymentModel";

    /**
     * Tells whether a {@link DeploymentModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7d920b64-b929-48e2-82b2-94f011b6b7ce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModel.STEREOTYPE_NAME));
    }

    @objid ("58d38552-8dda-427b-a8e6-fa300163771b")
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
        DeploymentModel other = (DeploymentModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2f6c3514-fc8f-48f6-9b6d-8135352cf2c6")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("b997a52d-07a7-466b-b0e5-0e09afdec7ff")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("5d2a3048-e33d-47ab-832f-df668bb49feb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("24423319-ed8e-4bd6-a221-351f53d55090")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("7824ca58-b756-4b62-98fc-fc9838496def")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("ad97ff7d-40db-4308-8522-afa823b2778f")
    protected DeploymentModel(final Package elt) {
        super(elt);
    }

    @objid ("bcfd6f5c-46e7-47aa-9a4b-79a22339b9f4")
    public static final class MdaTypes {
        @objid ("8ef7e2c6-048d-4989-89f0-9eaeafa089f9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2781ebcc-2990-417b-8ab9-e3d74e91a6e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("7962e2fc-d81f-47b7-bc66-85c422dbe1fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ac13a9f-025c-45d1-9f08-212f4d9b7f5a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7d620068-3fc6-4fec-8829-0444c0c3186f");
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
