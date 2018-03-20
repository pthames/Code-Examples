<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class ShadyOne
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(ShadyOne))
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.RadReg = New System.Windows.Forms.RadioButton()
        Me.RadChar = New System.Windows.Forms.RadioButton()
        Me.RadItal = New System.Windows.Forms.RadioButton()
        Me.RadEmp = New System.Windows.Forms.RadioButton()
        Me.btnStart = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Button3 = New System.Windows.Forms.Button()
        Me.txtOne = New System.Windows.Forms.TextBox()
        Me.txtTwo = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox1.SuspendLayout()
        Me.SuspendLayout()
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(50, 44)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(204, 207)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.PictureBox1.TabIndex = 0
        Me.PictureBox1.TabStop = False
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Impact", 21.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(29, 5)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(157, 36)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Welcome to"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Impact", 21.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(29, 254)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(237, 36)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Retirement Village"
        '
        'GroupBox1
        '
        Me.GroupBox1.BackColor = System.Drawing.SystemColors.Control
        Me.GroupBox1.Controls.Add(Me.RadReg)
        Me.GroupBox1.Controls.Add(Me.RadChar)
        Me.GroupBox1.Controls.Add(Me.RadItal)
        Me.GroupBox1.Controls.Add(Me.RadEmp)
        Me.GroupBox1.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.Location = New System.Drawing.Point(437, 44)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(200, 207)
        Me.GroupBox1.TabIndex = 3
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Select an Apartment"
        '
        'RadReg
        '
        Me.RadReg.AutoSize = True
        Me.RadReg.Location = New System.Drawing.Point(6, 154)
        Me.RadReg.Name = "RadReg"
        Me.RadReg.Size = New System.Drawing.Size(133, 38)
        Me.RadReg.TabIndex = 3
        Me.RadReg.TabStop = True
        Me.RadReg.Text = "Regency Apartment" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 2000 / month"
        Me.RadReg.UseVisualStyleBackColor = True
        '
        'RadChar
        '
        Me.RadChar.AutoSize = True
        Me.RadChar.Location = New System.Drawing.Point(6, 110)
        Me.RadChar.Name = "RadChar"
        Me.RadChar.Size = New System.Drawing.Size(156, 38)
        Me.RadChar.TabIndex = 2
        Me.RadChar.TabStop = True
        Me.RadChar.Text = "Charlestown Apartment" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 1900 / month"
        Me.RadChar.UseVisualStyleBackColor = True
        '
        'RadItal
        '
        Me.RadItal.AutoSize = True
        Me.RadItal.Location = New System.Drawing.Point(6, 66)
        Me.RadItal.Name = "RadItal"
        Me.RadItal.Size = New System.Drawing.Size(141, 38)
        Me.RadItal.TabIndex = 1
        Me.RadItal.TabStop = True
        Me.RadItal.Text = "Italianate Apartment" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 1650 / month"
        Me.RadItal.UseVisualStyleBackColor = True
        '
        'RadEmp
        '
        Me.RadEmp.AutoSize = True
        Me.RadEmp.Location = New System.Drawing.Point(6, 22)
        Me.RadEmp.Name = "RadEmp"
        Me.RadEmp.Size = New System.Drawing.Size(124, 38)
        Me.RadEmp.TabIndex = 0
        Me.RadEmp.TabStop = True
        Me.RadEmp.Text = "Empire Apartment" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 1500 / month"
        Me.RadEmp.UseVisualStyleBackColor = True
        '
        'btnStart
        '
        Me.btnStart.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnStart.Location = New System.Drawing.Point(437, 272)
        Me.btnStart.Name = "btnStart"
        Me.btnStart.Size = New System.Drawing.Size(200, 54)
        Me.btnStart.TabIndex = 4
        Me.btnStart.Text = "Choose an Apartment" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Then Click here to Continue."
        Me.btnStart.UseVisualStyleBackColor = True
        '
        'Button2
        '
        Me.Button2.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button2.Location = New System.Drawing.Point(25, 365)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(93, 38)
        Me.Button2.TabIndex = 5
        Me.Button2.Text = "Exit"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(376, 352)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(0, 13)
        Me.Label3.TabIndex = 6
        '
        'Button3
        '
        Me.Button3.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button3.Location = New System.Drawing.Point(146, 366)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(93, 38)
        Me.Button3.TabIndex = 7
        Me.Button3.Text = "Clear"
        Me.Button3.UseVisualStyleBackColor = True
        '
        'txtOne
        '
        Me.txtOne.Location = New System.Drawing.Point(560, 342)
        Me.txtOne.Name = "txtOne"
        Me.txtOne.Size = New System.Drawing.Size(77, 20)
        Me.txtOne.TabIndex = 8
        '
        'txtTwo
        '
        Me.txtTwo.Location = New System.Drawing.Point(560, 376)
        Me.txtTwo.Name = "txtTwo"
        Me.txtTwo.Size = New System.Drawing.Size(77, 20)
        Me.txtTwo.TabIndex = 9
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.Location = New System.Drawing.Point(389, 345)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(165, 17)
        Me.Label4.TabIndex = 10
        Me.Label4.Text = "Total Charges for Tenant One"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.Location = New System.Drawing.Point(388, 376)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(166, 17)
        Me.Label5.TabIndex = 11
        Me.Label5.Text = "Total Charges for Tenant Two"
        '
        'ShadyOne
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(649, 425)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.txtTwo)
        Me.Controls.Add(Me.txtOne)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.btnStart)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.PictureBox1)
        Me.Name = "ShadyOne"
        Me.Text = "Slim Shady Pines"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents RadReg As System.Windows.Forms.RadioButton
    Friend WithEvents RadChar As System.Windows.Forms.RadioButton
    Friend WithEvents RadItal As System.Windows.Forms.RadioButton
    Friend WithEvents RadEmp As System.Windows.Forms.RadioButton
    Friend WithEvents btnStart As System.Windows.Forms.Button
    Friend WithEvents Button2 As System.Windows.Forms.Button
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Button3 As System.Windows.Forms.Button
    Friend WithEvents txtOne As System.Windows.Forms.TextBox
    Friend WithEvents txtTwo As System.Windows.Forms.TextBox
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents Label5 As System.Windows.Forms.Label

End Class
