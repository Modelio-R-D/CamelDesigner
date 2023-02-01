/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("417f83d4-b324-4b5d-a0bd-04ac6fa7a930")
=======
    @objid ("db699b70-45ef-4ee8-a3f6-32239bc79924")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "DeploymentModel";

    /**
     * Tells whether a {@link DeploymentModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("5cc4fb5b-3653-4089-8aa5-bbf15a35bd2c")
=======
    @objid ("9d57f351-5baf-4b41-95af-7faa8bae35ce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModel.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("9bf9318c-eb38-40e1-8d95-f8a5f111c67f")
=======
    @objid ("03b11992-231c-4788-ad8c-89180ce2c3c3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e68aca47-941a-44e8-9199-8e5470b3bc3d")
=======
    @objid ("8151520e-ef81-44bf-89ee-2b7a0bbc1b9f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("d103fa7c-1aa6-426c-a42a-fa2cd4629649")
=======
    @objid ("3d33763c-3606-4a20-a9d8-b80f6065d534")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

<<<<<<< HEAD
    @objid ("69993192-959b-42b3-8d00-6d8a0dd03980")
=======
    @objid ("7929164f-0234-4bb6-845b-47761b505710")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e1470e11-7bec-4839-9fbc-67124420d319")
=======
    @objid ("bbf85933-81b3-48e8-aef7-b19fa7e47ec7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("587834ce-fa78-4f28-8d5a-f51205472ecc")
=======
    @objid ("05dd745c-335d-4da7-983a-7fbd84947b2c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected DeploymentModel(final Package elt) {
        super(elt);
    }

    @objid ("bcfd6f5c-46e7-47aa-9a4b-79a22339b9f4")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("f0a144c6-8f75-4e93-a298-26d29d403d7c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8f7bfdb2-c724-4227-8dc2-dabf19fef5e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("476d4a1a-a473-4a7e-b331-50b46517b97a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8d3698b-462d-49da-9733-94a775773b3a")
=======
        @objid ("04e8da25-59ea-48a7-b77c-aa65e6784918")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eff16def-f736-4c48-b78f-602c9df36c3c")
        private static Stereotype MDAASSOCDEP;

        @objid ("79784a50-ab3c-4578-9d6b-6a396778e955")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34fa3103-c6c1-4bff-87a3-03db23e38233")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
